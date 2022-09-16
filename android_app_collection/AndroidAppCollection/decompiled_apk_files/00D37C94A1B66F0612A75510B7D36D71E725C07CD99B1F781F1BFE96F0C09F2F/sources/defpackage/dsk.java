package defpackage;

import java.io.File;
import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: dsk  reason: default package */
/* loaded from: classes3.dex */
public final class dsk {
    final /* synthetic */ qzu a;

    public dsk(qzu qzuVar) {
        this.a = qzuVar;
    }

    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
