package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bbwh  reason: default package */
/* loaded from: classes3.dex */
final class bbwh implements Runnable {
    private final Context a;
    private final byte[] b;
    private final Uri c;
    private final bcpe d;
    @dzsi
    private final bbvx e;

    public bbwh(Context context, byte[] bArr, Uri uri, bcpe bcpeVar, @dzsi bbvx bbvxVar) {
        this.a = context;
        this.b = bArr;
        this.c = uri;
        this.d = bcpeVar;
        this.e = bbvxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? e = 0;
        e = 0;
        try {
            try {
                e = this.a.getContentResolver().openOutputStream(this.c);
                e.write(this.b);
                if (e == 0) {
                    return;
                }
                try {
                    e.close();
                    this.e.a(this.c);
                    this.d.b(this.c);
                } catch (IOException e2) {
                    deki.b(e2);
                }
            } catch (IOException e3) {
                deki.b(e3);
                if (e == 0) {
                    return;
                }
                try {
                    e.close();
                    this.e.a(this.c);
                    this.d.b(this.c);
                } catch (IOException e4) {
                    e = e4;
                    deki.b(e);
                }
            }
        } catch (Throwable th) {
            if (e != 0) {
                try {
                    e.close();
                    this.e.a(this.c);
                    this.d.b(this.c);
                } catch (IOException e5) {
                    deki.b(e5);
                }
            }
            throw th;
        }
    }
}
