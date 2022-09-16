package defpackage;
/* compiled from: PG */
/* renamed from: acni  reason: default package */
/* loaded from: classes2.dex */
final class acni extends bbf {
    final /* synthetic */ acnj a;

    public acni(acnj acnjVar) {
        this.a = acnjVar;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void b(int i) {
        acnj acnjVar = this.a;
        acnjVar.b = i;
        acnjVar.invalidate();
    }
}
