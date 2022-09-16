package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: aiuo  reason: default package */
/* loaded from: classes.dex */
public final class aiuo {
    public String a = "-";
    public String b = "-";
    private final zgz c;

    public aiuo(zgz zgzVar) {
        this.c = zgzVar;
    }

    public final void a(aowk aowkVar) {
        if (aowkVar == null) {
            this.b = "-";
        } else {
            this.b = Base64.encodeToString(aowkVar.toByteArray(), 11);
        }
        aiuf aiufVar = (aiuf) this.c.a();
        if (aiufVar != null) {
            aiufVar.t();
        }
    }

    public final void b(String str) {
        if (str == null) {
            str = "-";
        }
        this.a = str;
        aiuf aiufVar = (aiuf) this.c.a();
        if (aiufVar != null) {
            aiufVar.t();
        }
    }
}
