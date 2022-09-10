package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwpx  reason: default package */
/* loaded from: classes4.dex */
public class bwpx implements jbi {
    final /* synthetic */ int a;
    final /* synthetic */ bwpz b;

    public bwpx(bwpz bwpzVar, int i) {
        this.b = bwpzVar;
        this.a = i;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.b.a.getString(this.a);
    }
}
