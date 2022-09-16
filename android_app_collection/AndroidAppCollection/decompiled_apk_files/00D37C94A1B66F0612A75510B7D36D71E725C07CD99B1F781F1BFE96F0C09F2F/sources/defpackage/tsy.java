package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tsy  reason: default package */
/* loaded from: classes4.dex */
public final class tsy {
    public final Context a;
    public final tul b;
    public final twv c;
    public final twy d;
    public final tyk e;
    public final snc f;
    public final vjb g;
    public final ampq h;
    public final trv i;
    public final Executor j;

    public tsy(Context context, tul tulVar, twv twvVar, twy twyVar, tyk tykVar, snc sncVar, vjb vjbVar, ampq ampqVar, trv trvVar, Executor executor) {
        this.a = context;
        this.b = tulVar;
        this.c = twvVar;
        this.d = twyVar;
        this.e = tykVar;
        this.f = sncVar;
        this.g = vjbVar;
        this.h = ampqVar;
        this.i = trvVar;
        this.j = executor;
    }

    public final int a(Uri uri, List list) {
        int i;
        try {
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (!this.g.h(uri)) {
            return 0;
        }
        i = 0;
        for (Uri uri2 : this.g.b(uri)) {
            try {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                break;
                            }
                        } else if (!this.g.i(uri2)) {
                            uri2.getPath();
                            int i2 = typ.a;
                            this.g.f(uri2);
                            i++;
                        } else {
                            i += a(uri2, list);
                        }
                    }
                } catch (IOException e2) {
                    this.e.g(1059);
                    typ.f(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                }
            } catch (IOException e3) {
                e = e3;
                this.e.g(1059);
                typ.f(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                return i;
            }
        }
        return i;
    }
}
