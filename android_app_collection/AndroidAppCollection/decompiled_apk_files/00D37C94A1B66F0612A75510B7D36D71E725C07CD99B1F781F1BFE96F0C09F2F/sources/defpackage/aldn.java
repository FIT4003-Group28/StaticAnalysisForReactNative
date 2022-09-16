package defpackage;

import android.net.Uri;
import android.util.ArrayMap;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aldn  reason: default package */
/* loaded from: classes.dex */
public final class aldn {
    private final HashMap a = new HashMap();
    private final Map b = new ArrayMap();

    public final aldm a(Uri uri) {
        if (uri == null) {
            throw new FileNotFoundException("Null Uri scheme");
        }
        aldm aldmVar = (aldm) this.a.get(uri.getScheme());
        if (aldmVar != null) {
            return aldmVar;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unsupported Uri scheme: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }

    public final void b(aldm aldmVar) {
        this.a.put(aldmVar.a(), aldmVar);
    }

    public final void c() {
        synchronized (this.b) {
            Iterator it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                aldj aldjVar = (aldj) ((Map.Entry) it.next()).getValue();
                if (aldjVar != null) {
                    aldjVar.j();
                }
                it.remove();
            }
        }
    }

    public final aldj d(int i, Uri uri, aldi aldiVar) {
        aldj aldjVar;
        synchronized (this.b) {
            aldjVar = (aldj) this.b.get(uri);
            if (aldjVar == null || !aldjVar.l()) {
                aldjVar = a(uri).b(i, uri, aldiVar);
                this.b.put(uri, aldjVar);
            }
        }
        return aldjVar;
    }
}
