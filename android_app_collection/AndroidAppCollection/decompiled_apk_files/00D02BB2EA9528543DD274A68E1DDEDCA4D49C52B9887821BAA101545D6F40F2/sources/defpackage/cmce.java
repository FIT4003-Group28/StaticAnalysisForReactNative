package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
/* compiled from: PG */
/* renamed from: cmce  reason: default package */
/* loaded from: classes5.dex */
public final class cmce {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public cmce() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static void b(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
