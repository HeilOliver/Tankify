package at.fhv.tankify.business.core.usecase;

public interface IUseCase<Input, Output> {

    Output Handle(Input value);
}
