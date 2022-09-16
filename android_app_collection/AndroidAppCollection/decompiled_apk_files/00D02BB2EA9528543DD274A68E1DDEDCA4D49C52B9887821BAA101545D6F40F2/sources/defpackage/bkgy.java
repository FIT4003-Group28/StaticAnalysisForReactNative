package defpackage;
/* compiled from: PG */
/* renamed from: bkgy  reason: default package */
/* loaded from: classes3.dex */
public class bkgy {
    public static final dcep<dnwv> a = dcep.C(dnwv.GET_A_QUOTE, dnwv.CHATTY_BOOK);
    private final apyx b;
    private final btxc c;

    public bkgy(btxc btxcVar, apyx apyxVar) {
        this.c = btxcVar;
        this.b = apyxVar;
    }

    private final dkht c() {
        btvo l = this.c.a().l();
        if (l != null) {
            return l.getBusinessMessagingParameters();
        }
        return dkht.ac;
    }

    public final boolean a() {
        return this.b.a() && c().F;
    }

    public final boolean b() {
        return this.b.a() && c().E;
    }
}
