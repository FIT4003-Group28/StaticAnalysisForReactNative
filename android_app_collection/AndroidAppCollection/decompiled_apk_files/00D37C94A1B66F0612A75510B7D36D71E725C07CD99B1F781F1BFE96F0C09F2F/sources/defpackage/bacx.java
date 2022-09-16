package defpackage;

import java.io.FileDescriptor;
import java.net.Socket;
/* compiled from: PG */
/* renamed from: bacx  reason: default package */
/* loaded from: classes2.dex */
public final class bacx extends Socket {
    public bacx(FileDescriptor fileDescriptor) {
        super(new bacw(fileDescriptor));
    }
}
