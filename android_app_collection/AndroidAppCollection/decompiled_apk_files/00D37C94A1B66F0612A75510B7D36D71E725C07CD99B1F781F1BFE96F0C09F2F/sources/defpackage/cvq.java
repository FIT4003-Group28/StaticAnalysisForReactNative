package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: cvq  reason: default package */
/* loaded from: classes3.dex */
public final class cvq extends axiz implements Closeable {
    static {
        axlg.d(cvq.class);
    }

    public cvq(axja axjaVar, cvo cvoVar) {
        t(axjaVar, axjaVar.c(), cvoVar);
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    public final cwk a() {
        for (cvs cvsVar : i()) {
            if (cvsVar instanceof cwk) {
                return (cwk) cvsVar;
            }
        }
        return null;
    }

    @Override // defpackage.axiz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    @Override // defpackage.axiz
    public final String toString() {
        String obj = this.r.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
