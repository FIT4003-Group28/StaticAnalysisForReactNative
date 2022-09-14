package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: clnj  reason: default package */
/* loaded from: classes5.dex */
public final class clnj {
    public String a;
    public Uri b;
    private final List c;
    private final List d;

    public clnj() {
        Collections.emptyList();
        Collections.emptyMap();
        this.c = Collections.emptyList();
        this.d = Collections.emptyList();
    }

    public final clno a() {
        clnn clnnVar;
        cmmn.c(true);
        Uri uri = this.b;
        if (uri != null) {
            clnnVar = new clnn(uri, this.c, this.d);
            String str = this.a;
            if (str == null) {
                str = uri.toString();
            }
            this.a = str;
        } else {
            clnnVar = null;
        }
        String str2 = this.a;
        cmmn.f(str2);
        return new clno(str2, new clnk(), clnnVar, new clnm(), new clnp());
    }
}
