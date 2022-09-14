package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amax  reason: default package */
/* loaded from: classes2.dex */
public final class amax implements ambp {
    @Override // defpackage.ambp
    public final alyg a(amze amzeVar, akry akryVar, alyh alyhVar, byte[] bArr, akrx akrxVar, int i) {
        if (bArr.length == 0) {
            return new alwf(amzeVar, akryVar, alyhVar, bArr, akrxVar, 0);
        }
        if (bArr[0] == akqx.a[0]) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            if (dataInputStream.readInt() == 1146241364) {
                int a = bvpf.a(dataInputStream);
                if (a == 7 || a == 8) {
                    alyh alyhVar2 = new alyh(bvpf.a(dataInputStream), bvpf.a(dataInputStream), bvpf.a(dataInputStream));
                    if (alyhVar2.b != alyhVar.b || alyhVar2.c != alyhVar.c || alyhVar2.a != alyhVar.a) {
                        String valueOf = String.valueOf(alyhVar);
                        String valueOf2 = String.valueOf(alyhVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
                        sb.append("Expected tile coords: ");
                        sb.append(valueOf);
                        sb.append(" but received ");
                        sb.append(valueOf2);
                        throw new IOException(sb.toString());
                    }
                    bvpf.a(dataInputStream);
                    int a2 = bvpf.a(dataInputStream);
                    int a3 = bvpf.a(dataInputStream);
                    int a4 = bvpf.a(dataInputStream);
                    if (a2 < 0 || a3 < 0) {
                        StringBuilder sb2 = new StringBuilder(77);
                        sb2.append("The tile image dimensions were invalid (width=");
                        sb2.append(a2);
                        sb2.append(", height=");
                        sb2.append(a3);
                        throw new IOException(sb2.toString());
                    } else if (a4 >= 0) {
                        bArr = new byte[a4];
                        dataInputStream.readFully(bArr);
                    } else {
                        StringBuilder sb3 = new StringBuilder(47);
                        sb3.append("The tile image size of ");
                        sb3.append(a4);
                        sb3.append(" is not valid");
                        throw new IOException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(52);
                    sb4.append("Version mismatch: 7 or 8 expected, ");
                    sb4.append(a);
                    sb4.append(" found");
                    throw new IOException(sb4.toString());
                }
            }
        }
        return new alwf(amzeVar, akryVar, alyhVar, bArr, akrxVar, i);
    }
}
