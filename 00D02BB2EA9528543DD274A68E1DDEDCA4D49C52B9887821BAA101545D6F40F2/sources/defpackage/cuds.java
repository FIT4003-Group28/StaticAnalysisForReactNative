package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuds  reason: default package */
/* loaded from: classes5.dex */
public final class cuds extends cugi {
    private String a;
    private ContactId b;
    private ConversationId c;
    private Long d;
    private dbsg<String> e;
    private cugm f;
    private cugo g;
    private dbsg<String> h;
    private dcdn<String, dspd> i;
    private Integer j;
    private cugr k;
    private Integer l;
    private Integer m;
    private int n;

    public cuds() {
        this.e = dbpy.a;
        this.h = dbpy.a;
    }

    public cuds(cugu cuguVar) {
        this.e = dbpy.a;
        this.h = dbpy.a;
        cudt cudtVar = (cudt) cuguVar;
        this.a = cudtVar.a;
        this.n = cudtVar.n;
        this.b = cudtVar.b;
        this.c = cudtVar.c;
        this.d = cudtVar.d;
        this.e = cudtVar.e;
        this.f = cudtVar.f;
        this.g = cudtVar.g;
        this.h = cudtVar.h;
        this.i = cudtVar.i;
        this.j = Integer.valueOf(cudtVar.j);
        this.k = cudtVar.k;
        this.l = Integer.valueOf(cudtVar.l);
        this.m = Integer.valueOf(cudtVar.m);
    }

    @Override // defpackage.cugi
    public final void b(int i) {
        this.j = Integer.valueOf(i);
    }

    @Override // defpackage.cugi
    public final void c(ConversationId conversationId) {
        if (conversationId != null) {
            this.c = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.cugi
    public final void d(String str) {
        this.e = dbsg.i(str);
    }

    @Override // defpackage.cugi
    public final void e(int i) {
        this.m = Integer.valueOf(i);
    }

    @Override // defpackage.cugi
    public final void f(int i) {
        this.l = Integer.valueOf(i);
    }

    @Override // defpackage.cugi
    public final void g(cugm cugmVar) {
        if (cugmVar != null) {
            this.f = cugmVar;
            return;
        }
        throw new NullPointerException("Null messageContent");
    }

    @Override // defpackage.cugi
    public final void h(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.cugi
    public final void i(cugo cugoVar) {
        if (cugoVar != null) {
            this.g = cugoVar;
            return;
        }
        throw new NullPointerException("Null messageStatus");
    }

    @Override // defpackage.cugi
    public final void j(Map<String, dspd> map) {
        this.i = dcdn.r(map);
    }

    @Override // defpackage.cugi
    public final void k(cugr cugrVar) {
        this.k = cugrVar;
    }

    @Override // defpackage.cugi
    public final void l(ContactId contactId) {
        if (contactId != null) {
            this.b = contactId;
            return;
        }
        throw new NullPointerException("Null sender");
    }

    @Override // defpackage.cugi
    public final void m(Long l) {
        if (l != null) {
            this.d = l;
            return;
        }
        throw new NullPointerException("Null serverTimestampUs");
    }

    @Override // defpackage.cugi
    public final void n(String str) {
        this.h = dbsg.i(str);
    }

    @Override // defpackage.cugi
    public final void o(int i) {
        this.n = i;
    }

    @Override // defpackage.cugi
    public final cugu a() {
        String str = this.a == null ? " messageId" : "";
        if (this.n == 0) {
            str = str.concat(" messageType");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" sender");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" conversationId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" serverTimestampUs");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" messageContent");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" messageStatus");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" capability");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" renderingDetails");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" intendedRenderingType");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" filterableFlags");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudt(this.a, this.n, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j.intValue(), this.k, this.l.intValue(), this.m.intValue());
    }
}
