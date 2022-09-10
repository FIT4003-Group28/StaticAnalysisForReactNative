package defpackage;
/* compiled from: PG */
/* renamed from: bcov  reason: default package */
/* loaded from: classes.dex */
public final class bcov implements dbsl<afga> {
    private final btvo a;

    public bcov(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        char c;
        afga afgaVar2 = afgaVar;
        if (this.a.getEnableFeatureParameters().q && !bcow.d(afgaVar2.a).isEmpty()) {
            String action = afgaVar2.a.getAction();
            int hashCode = action.hashCode();
            if (hashCode != -1173264947) {
                if (hashCode == -58484670 && action.equals("android.intent.action.SEND_MULTIPLE")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.intent.action.SEND")) {
                    c = 0;
                }
                c = 65535;
            }
            return c == 0 || c == 1;
        }
        return false;
    }
}
