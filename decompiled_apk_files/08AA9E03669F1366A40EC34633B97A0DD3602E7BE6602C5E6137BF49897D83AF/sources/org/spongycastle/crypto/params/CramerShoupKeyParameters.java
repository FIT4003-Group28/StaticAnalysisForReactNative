package org.spongycastle.crypto.params;
/* loaded from: classes.dex */
public class CramerShoupKeyParameters extends AsymmetricKeyParameter {
    private CramerShoupParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public CramerShoupKeyParameters(boolean z, CramerShoupParameters cramerShoupParameters) {
        super(z);
        this.params = cramerShoupParameters;
    }

    public CramerShoupParameters getParameters() {
        return this.params;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupKeyParameters)) {
            return false;
        }
        CramerShoupKeyParameters cramerShoupKeyParameters = (CramerShoupKeyParameters) obj;
        if (this.params != null) {
            return this.params.equals(cramerShoupKeyParameters.getParameters());
        }
        return cramerShoupKeyParameters.getParameters() == null;
    }

    public int hashCode() {
        int i = !isPrivate();
        return this.params != null ? i ^ this.params.hashCode() : i;
    }
}
