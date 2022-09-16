package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.m0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class s extends m0 {

    /* renamed from: a  reason: collision with root package name */
    private int f7086a;

    /* JADX INFO: Access modifiers changed from: protected */
    public s(byte[] bArr) {
        com.google.android.gms.common.internal.s.a(bArr.length == 25);
        this.f7086a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] e();

    public boolean equals(Object obj) {
        c.e.a.b.c.a j;
        if (obj != null && (obj instanceof l0)) {
            try {
                l0 l0Var = (l0) obj;
                if (l0Var.l() != hashCode() || (j = l0Var.j()) == null) {
                    return false;
                }
                return Arrays.equals(e(), (byte[]) c.e.a.b.c.b.a(j));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f7086a;
    }

    @Override // com.google.android.gms.common.internal.l0
    public final c.e.a.b.c.a j() {
        return c.e.a.b.c.b.a(e());
    }

    @Override // com.google.android.gms.common.internal.l0
    public final int l() {
        return hashCode();
    }
}
