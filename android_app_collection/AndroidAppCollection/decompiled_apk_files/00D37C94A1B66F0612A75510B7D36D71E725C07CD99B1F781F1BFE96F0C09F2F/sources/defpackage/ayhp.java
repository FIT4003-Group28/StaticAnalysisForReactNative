package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayhp  reason: default package */
/* loaded from: classes2.dex */
public final class ayhp implements Runnable {
    final /* synthetic */ ayez a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ayia c;

    public ayhp(ayia ayiaVar, ayez ayezVar, boolean z) {
        this.c = ayiaVar;
        this.a = ayezVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.m.c(this.a, this.b);
    }
}
