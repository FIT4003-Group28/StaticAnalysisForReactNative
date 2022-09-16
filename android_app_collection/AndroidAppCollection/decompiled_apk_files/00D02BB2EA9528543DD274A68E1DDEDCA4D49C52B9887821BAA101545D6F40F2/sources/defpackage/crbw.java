package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: crbw  reason: default package */
/* loaded from: classes5.dex */
public final class crbw {
    public static final crbw c = new crbw(false, null);
    public static final crbw d = new crbw(true, null);
    public final boolean a;
    @dzsi
    public final File b;

    private crbw(boolean z, @dzsi File file) {
        this.a = z;
        this.b = file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static crbw a(@dzsi File file) {
        return file == null ? c : new crbw(false, file);
    }
}
