package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqs  reason: default package */
/* loaded from: classes2.dex */
public final class aqs implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ aqt b;

    public aqs(aqt aqtVar, Object obj) {
        this.b = aqtVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqt aqtVar = this.b;
        Object obj = this.a;
        if (aqtVar.f()) {
            aqtVar.c();
        } else {
            aqtVar.b(obj);
        }
        aqtVar.f = 3;
    }
}
