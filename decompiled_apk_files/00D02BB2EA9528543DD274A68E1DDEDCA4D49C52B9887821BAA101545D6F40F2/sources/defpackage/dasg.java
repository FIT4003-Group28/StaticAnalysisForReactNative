package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dasg  reason: default package */
/* loaded from: classes5.dex */
public final class dasg {
    int a;
    public String b;
    public String c;

    public dasg(int i, dasa dasaVar) {
        dbsk.a(true);
        this.a = i;
        dbsk.s(dasaVar);
    }

    public dasg(dasf dasfVar) {
        this(dasfVar.c, dasfVar.a());
        try {
            String g = dasfVar.g();
            this.b = g;
            if (g.length() == 0) {
                this.b = null;
            }
        } catch (IOException e) {
            deki.b(e);
        }
        StringBuilder a = dash.a(dasfVar);
        if (this.b != null) {
            a.append(daux.a);
            a.append(this.b);
        }
        this.c = a.toString();
    }
}
