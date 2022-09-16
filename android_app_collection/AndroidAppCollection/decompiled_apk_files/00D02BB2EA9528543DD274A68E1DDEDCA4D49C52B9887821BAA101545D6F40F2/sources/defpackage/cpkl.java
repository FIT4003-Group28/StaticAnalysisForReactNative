package defpackage;

import org.chromium.net.CronetException;
/* compiled from: PG */
/* renamed from: cpkl  reason: default package */
/* loaded from: classes5.dex */
final class cpkl extends CronetException {
    public cpkl(Throwable th) {
        super("UTF-8 is not supported on this device.", th);
    }
}
