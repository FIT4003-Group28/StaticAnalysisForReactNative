package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axrr  reason: default package */
/* loaded from: classes.dex */
public final class axrr {
    public final String[] a;
    public final axrv b;

    public axrr(String[] strArr, axrv axrvVar) {
        this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        this.b = axrvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String[] strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        Arrays.sort(strArr2);
        Arrays.sort(this.a);
        return Arrays.equals(this.a, strArr2);
    }
}
