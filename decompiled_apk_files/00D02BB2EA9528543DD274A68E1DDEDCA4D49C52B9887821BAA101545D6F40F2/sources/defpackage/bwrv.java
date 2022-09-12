package defpackage;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
/* compiled from: PG */
/* renamed from: bwrv  reason: default package */
/* loaded from: classes4.dex */
public final class bwrv {
    public final FileOutputStream a;
    public final FileLock b;
    public final String c;
    public final /* synthetic */ bwrw d;

    public bwrv(bwrw bwrwVar, FileOutputStream fileOutputStream, FileLock fileLock, String str) {
        this.d = bwrwVar;
        this.a = fileOutputStream;
        this.b = fileLock;
        this.c = str;
        bwrwVar.a.add(str);
    }
}
