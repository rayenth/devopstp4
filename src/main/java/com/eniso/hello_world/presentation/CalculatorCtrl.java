package com.eniso.hello_world.presentation;

import com.eniso.hello_world.enumeration.MathematicalOperations;
import com.eniso.hello_world.service.CalculatorService;
import javax.faces.bean.ManagedBean;

/**
 * Controller class for the calculator application.
 * Handles user inputs and communicates with CalculatorService.
 */
@ManagedBean
public final class CalculatorCtrl {

    /** Model instance holding user inputs and result. */
    private final Model model = new Model();

    /** Service instance that performs the arithmetic operations. */
    private final CalculatorService service = new CalculatorService();

    /** @return the model */
    public Model getModel() {
        return model;
    }

    /** Performs the calculation using the service and updates the model. */
    public void result() {
        String calculation = service.result(
            this.model.getA(),
            this.model.getB(),
            this.model.getOperator()
        );
        this.model.setResult(calculation);
    }

    /** @return array of operations */
    public MathematicalOperations[] getOperations() {
        return MathematicalOperations.values();
    }

    /** Inner class representing the model for the calculator. */
    public static final class Model {

        /** First operand. */
        private int a;

        /** Second operand. */
        private int b;

        /** Selected mathematical operation. */
        private MathematicalOperations operator;

        /** Result of the calculation. */
        private String result;

        /** @return the first operand */
        public int getA() {
            return a;
        }

        /** @param valueA first operand */
        public void setA(final int valueA) {
            this.a = valueA;
        }

        /** @return the second operand */
        public int getB() {
            return b;
        }

        /** @param valueB second operand */
        public void setB(final int valueB) {
            this.b = valueB;
        }

        /** @return the selected operation */
        public MathematicalOperations getOperator() {
            return operator;
        }

        /** @param op mathematical operation */
        public void setOperator(final MathematicalOperations op) {
            this.operator = op;
        }

        /** @return the result as a string */
        public String getResult() {
            return result;
        }

        /** @param valueResult calculation result */
        public void setResult(final String valueResult) {
            this.result = valueResult;
        }
    }
}
