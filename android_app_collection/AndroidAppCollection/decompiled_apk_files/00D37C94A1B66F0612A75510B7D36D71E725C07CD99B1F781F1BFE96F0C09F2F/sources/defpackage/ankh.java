package defpackage;
/* compiled from: PG */
/* renamed from: ankh  reason: default package */
/* loaded from: classes.dex */
public final class ankh extends anie {
    private anki a;

    public ankh(anki ankiVar) {
        this.a = ankiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        anki ankiVar = this.a;
        if (ankiVar != null) {
            int length = ankiVar.d.length;
            int i = ankiVar.c.get();
            StringBuilder sb = new StringBuilder(49);
            sb.append("inputCount=[");
            sb.append(length);
            sb.append("], remaining=[");
            sb.append(i);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        anki ankiVar = this.a;
        if (super.cancel(z)) {
            ankiVar.getClass();
            ankiVar.a = true;
            if (!z) {
                ankiVar.b = false;
            }
            ankiVar.a();
            return true;
        }
        return false;
    }

    @Override // defpackage.anie
    protected final void qu() {
        this.a = null;
    }
}
