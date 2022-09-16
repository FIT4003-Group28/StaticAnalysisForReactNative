package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: pix  reason: default package */
/* loaded from: classes4.dex */
public final class pix {
    public Uri a;
    public Object b;
    private String c;
    private List d;
    private List e;
    private pje f;

    public pix() {
        Collections.emptyList();
        Collections.emptyMap();
        this.d = Collections.emptyList();
        this.e = Collections.emptyList();
    }

    public final pjc a() {
        ptx.e(true);
        Uri uri = this.a;
        pjb pjbVar = uri != null ? new pjb(uri, this.d, this.e, this.b) : null;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        piy piyVar = new piy();
        pja pjaVar = new pja();
        pje pjeVar = this.f;
        if (pjeVar == null) {
            pjeVar = pje.a;
        }
        return new pjc(str2, piyVar, pjbVar, pjaVar, pjeVar);
    }

    public final void b(String str) {
        ptx.a(str);
        this.c = str;
    }

    public pix(pjc pjcVar) {
        this();
        this.c = pjcVar.a;
        this.f = pjcVar.d;
        pjb pjbVar = pjcVar.b;
        if (pjbVar != null) {
            this.a = pjbVar.a;
            this.d = pjbVar.e;
            this.e = pjbVar.g;
            this.b = pjbVar.h;
        }
    }
}
