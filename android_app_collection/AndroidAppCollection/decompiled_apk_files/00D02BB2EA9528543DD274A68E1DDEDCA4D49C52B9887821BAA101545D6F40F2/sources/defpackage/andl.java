package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: andl  reason: default package */
/* loaded from: classes2.dex */
public final class andl implements akzt {
    final /* synthetic */ andm a;

    public andl(andm andmVar) {
        this.a = andmVar;
    }

    @Override // defpackage.akzt
    public final void a() {
        this.a.b = true;
    }

    @Override // defpackage.akzt
    public final void b() {
        this.a.b = false;
    }

    @Override // defpackage.akzt
    public final void c() {
        andm andmVar = this.a;
        andmVar.c = null;
        andmVar.b = false;
    }
}
