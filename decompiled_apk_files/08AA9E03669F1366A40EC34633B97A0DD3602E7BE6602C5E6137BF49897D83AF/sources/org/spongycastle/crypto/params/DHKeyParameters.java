package org.spongycastle.crypto.params;
/* loaded from: classes.dex */
public class DHKeyParameters extends AsymmetricKeyParameter {
    private DHParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public DHKeyParameters(boolean z, DHParameters dHParameters) {
        super(z);
        this.params = dHParameters;
    }

    public DHParameters getParameters() {
        return this.params;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters dHKeyParameters = (DHKeyParameters) obj;
        if (this.params != null) {
            return this.params.equals(dHKeyParameters.getParameters());
        }
        return dHKeyParameters.getParameters() == null;
    }

    public int hashCode() {
        int i = !isPrivate();
        return this.params != null ? i ^ this.params.hashCode() : i;
    }
}
