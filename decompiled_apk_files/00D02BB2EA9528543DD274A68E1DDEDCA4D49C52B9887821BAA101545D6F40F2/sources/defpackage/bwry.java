package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bwry  reason: default package */
/* loaded from: classes4.dex */
public final class bwry implements bwsa {
    private final HashMap<String, byte[]> a;

    public bwry() {
        new HashMap();
        this.a = new HashMap<>();
    }

    @Override // defpackage.bwsa
    public final byte[] a(String str) {
        return this.a.get(str);
    }

    @Override // defpackage.bwsa
    public final synchronized void b(String str) {
        if (this.a.containsKey(str)) {
            this.a.remove(str);
        }
    }

    @Override // defpackage.bwsa
    public final synchronized void d(byte[] bArr, String str) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.a.put(str, bArr);
    }
}
