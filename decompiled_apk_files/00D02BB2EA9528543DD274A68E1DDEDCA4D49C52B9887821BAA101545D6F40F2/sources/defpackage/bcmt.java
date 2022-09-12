package defpackage;
/* compiled from: PG */
/* renamed from: bcmt  reason: default package */
/* loaded from: classes3.dex */
public class bcmt implements cqkp {
    boolean a = true;

    public synchronized boolean a() {
        if (this.a) {
            this.a = false;
            return true;
        }
        return false;
    }
}
