package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: pxh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pxh implements ThreadFactory {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public pxh(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ pxh(String str, int i, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new Thread(runnable, this.a);
            }
            return new Thread(runnable, this.a);
        }
        return new Thread(runnable, this.a);
    }
}
