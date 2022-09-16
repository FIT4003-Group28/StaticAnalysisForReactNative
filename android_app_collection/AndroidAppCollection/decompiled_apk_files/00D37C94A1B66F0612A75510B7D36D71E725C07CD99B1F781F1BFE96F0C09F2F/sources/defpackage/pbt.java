package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: pbt  reason: default package */
/* loaded from: classes4.dex */
public class pbt extends IOException {
    public final int a;

    public pbt(IOException iOException, int i) {
        super(iOException);
        this.a = i;
    }

    public pbt(String str) {
        super(str);
        this.a = 1;
    }

    public pbt(String str, IOException iOException) {
        super(str, iOException);
        this.a = 1;
    }
}
