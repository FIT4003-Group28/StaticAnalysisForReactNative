package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aomi  reason: default package */
/* loaded from: classes2.dex */
public final class aomi implements jco {
    final /* synthetic */ aomk a;

    public aomi(aomk aomkVar) {
        this.a = aomkVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        aomk aomkVar = this.a;
        int i2 = aomkVar.b;
        if (z && i != i2) {
            this.a.c.m(new cjte(deaf.SWIPE, i < i2 ? dead.RIGHT : dead.LEFT), aomkVar.a.get(i2).k());
        }
        this.a.o(i);
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
