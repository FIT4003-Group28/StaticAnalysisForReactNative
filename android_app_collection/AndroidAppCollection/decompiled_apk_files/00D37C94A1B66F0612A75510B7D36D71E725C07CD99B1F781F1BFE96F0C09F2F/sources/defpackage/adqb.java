package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: adqb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adqb implements Runnable {
    public final /* synthetic */ adqh a;
    private final /* synthetic */ int b;

    public /* synthetic */ adqb(adqh adqhVar) {
        this.a = adqhVar;
    }

    public /* synthetic */ adqb(adqh adqhVar, int i) {
        this.b = i;
        this.a = adqhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppStatus a;
        String str;
        int i = this.b;
        if (i == 0) {
            adqh adqhVar = this.a;
            adqhVar.g.f();
            adqhVar.aC();
        } else if (i == 1) {
            adqh adqhVar2 = this.a;
            try {
                adqhVar2.g.e(adqhVar2.o);
            } catch (IOException e) {
                zep.f(adqh.a, "Failed to start Web Socket Server", e);
            }
        } else if (i != 2) {
            adqh adqhVar3 = this.a;
            Uri uri = adqhVar3.m.b;
            if (uri == null) {
                String str2 = adqh.a;
                String valueOf = String.valueOf(adqhVar3.m);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Missing app URL to launch YouTube on DIAL device ");
                sb.append(valueOf);
                zep.c(str2, sb.toString());
                adqhVar3.an(adne.UNKNOWN, atcv.MDX_SESSION_DISCONNECT_REASON_DIAL_MISSING_URL);
                return;
            }
            adqhVar3.c.c(uri, adqhVar3.ag, adqhVar3.i, adqhVar3.m.d, new adqe(adqhVar3));
        } else {
            adqh adqhVar4 = this.a;
            Uri uri2 = adqhVar4.l;
            if (uri2 == null) {
                Uri uri3 = adqhVar4.m.b;
                if (uri3 != null && (a = adqhVar4.d.a(uri3)) != null) {
                    AutoValue_AppStatus autoValue_AppStatus = (AutoValue_AppStatus) a;
                    if (autoValue_AppStatus.a == 1 && (str = autoValue_AppStatus.c) != null) {
                        uri2 = uri3.buildUpon().appendPath(str).build();
                    }
                }
                uri2 = null;
            }
            if (uri2 != null) {
                String str3 = adqh.a;
                String valueOf2 = String.valueOf(uri2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("Sending stop request to ");
                sb2.append(valueOf2);
                zep.h(str3, sb2.toString());
                adqhVar4.c.b(uri2);
            }
            adqhVar4.aB();
        }
    }
}
