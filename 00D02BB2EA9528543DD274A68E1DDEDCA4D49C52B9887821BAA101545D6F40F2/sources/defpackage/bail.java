package defpackage;
/* renamed from: bail  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bail implements dbsl {
    static final dbsl a = new bail();

    private bail() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        azva azvaVar = (azva) obj;
        return (azvaVar.a == dndr.HOME || azvaVar.a == dndr.WORK) ? false : true;
    }
}
