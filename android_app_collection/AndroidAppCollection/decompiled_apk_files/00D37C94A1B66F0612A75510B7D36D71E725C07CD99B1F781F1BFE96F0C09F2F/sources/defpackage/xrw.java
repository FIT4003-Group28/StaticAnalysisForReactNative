package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xrw  reason: default package */
/* loaded from: classes4.dex */
public final class xrw {
    public final Set a = amyv.e();
    public xrv b;
    private final Context c;
    private final Executor d;
    private final Executor e;
    private final xry f;
    private final afts g;

    public xrw(Context context, Executor executor, Executor executor2, xry xryVar, afts aftsVar) {
        this.c = context;
        this.d = executor;
        this.e = executor2;
        this.f = xryVar;
        this.g = aftsVar;
    }

    private final void e(Runnable runnable) {
        this.e.execute(runnable);
    }

    public final void a(xru xruVar) {
        if (xruVar != null) {
            this.a.add(xruVar);
        }
    }

    public final void b(xru xruVar) {
        this.a.remove(xruVar);
    }

    public final void c(final String str, final String str2, final Uri uri) {
        this.d.execute(new Runnable() { // from class: xrt
            @Override // java.lang.Runnable
            public final void run() {
                xrw.this.d(str, str2, uri);
            }
        });
    }

    public final void d(String str, String str2, Uri uri) {
        byte[] bArr;
        try {
            byte[] c = anek.c(this.c.getContentResolver().openInputStream(uri));
            final Drawable drawable = (Drawable) this.g.b(c);
            final int length = c.length;
            e(new Runnable() { // from class: xrr
                @Override // java.lang.Runnable
                public final void run() {
                    xrw xrwVar = xrw.this;
                    Drawable drawable2 = drawable;
                    int i = length;
                    for (xru xruVar : xrwVar.a) {
                        xruVar.c(drawable2, i);
                    }
                }
            });
            xry xryVar = this.f;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
            ylr.b();
            if (xryVar.c.t()) {
                awyf awyfVar = new awyf(new BufferedInputStream(byteArrayInputStream));
                awya awyaVar = new awya();
                awyaVar.e("X-YouTube-ChannelId", str2);
                afvm c2 = xryVar.c.c();
                if (!(c2 instanceof AccountIdentity)) {
                    throw new xrx("AccountIdentity is required");
                }
                afvv d = xryVar.b.d((AccountIdentity) c2);
                if (!d.g()) {
                    throw new xrx("Could not fetch auth token");
                }
                Pair b = d.b();
                awyaVar.e((String) b.first, (String) b.second);
                awyp a = xryVar.e.a(str, awyaVar, awyfVar, null, xryVar.d);
                try {
                    try {
                        awys awysVar = (awys) a.a().get();
                        if (awysVar.b()) {
                            throw new cev(awysVar.a);
                        }
                        if (!awysVar.a()) {
                            throw new cev();
                        }
                        awyb awybVar = awysVar.b;
                        int i = awybVar.a;
                        if (i >= 0) {
                            awya awyaVar2 = awybVar.b;
                            awyaVar2.getClass();
                            try {
                                InputStream inputStream = awybVar.c;
                                if (inputStream != null) {
                                    byte[] c3 = anek.c(inputStream);
                                    if (i != 200) {
                                        throw new cfd(xry.a(i, awyaVar2, c3));
                                    }
                                    try {
                                        final String string = new JSONObject(new String(c3, xry.a)).getString("encryptedBlobId");
                                        e(new Runnable() { // from class: xrs
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                xrw xrwVar = xrw.this;
                                                String str3 = string;
                                                for (xru xruVar : xrwVar.a) {
                                                    xruVar.b(str3);
                                                }
                                            }
                                        });
                                        return;
                                    } catch (JSONException unused) {
                                        throw new cey(xry.a(200, awyaVar2, bArr));
                                    }
                                }
                                throw new cev();
                            } catch (IOException unused2) {
                                throw new cev();
                            }
                        }
                        throw new cev();
                    } catch (InterruptedException e) {
                        a.f();
                        throw e;
                    } catch (ExecutionException e2) {
                        if (e2.getCause() != null) {
                            throw new cev(e2.getCause());
                        }
                        throw new cev();
                    }
                } catch (cev e3) {
                    e = e3;
                    throw new xrx(e);
                } catch (cey e4) {
                    e = e4;
                    throw new xrx(e);
                } catch (cfd e5) {
                    e = e5;
                    throw new xrx(e);
                }
            }
            throw new xrx("Must be signed in to upload");
        } catch (Exception unused3) {
            this.b = new xrv(str, str2, uri);
            e(new Runnable() { // from class: xrq
                @Override // java.lang.Runnable
                public final void run() {
                    for (xru xruVar : xrw.this.a) {
                        xruVar.a();
                    }
                }
            });
        }
    }
}
