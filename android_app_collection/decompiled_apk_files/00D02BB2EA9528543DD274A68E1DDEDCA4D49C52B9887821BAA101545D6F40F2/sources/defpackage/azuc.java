package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: azuc  reason: default package */
/* loaded from: classes.dex */
public final class azuc extends afhx {
    public static final dbsl<afga> a = azub.a;
    public final eeu b;
    public final axwy c;
    public final Uri d;
    private final gga e;

    public azuc(gga ggaVar, eeu eeuVar, axwy axwyVar, Intent intent, @dzsi String str) {
        super(intent, str, afid.PLACE_LIST_SHARED_URL);
        this.e = ggaVar;
        this.b = eeuVar;
        this.c = axwyVar;
        this.d = afhg.b(intent);
    }

    @Override // defpackage.afhx
    public final void a() {
        affw.a(this.f, this.e, new Runnable(this) { // from class: azua
            private final azuc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azuc azucVar = this.a;
                Matcher matcher = Pattern.compile("/maps/placelists/list/([a-zA-Z0-9_-]+)/?$").matcher(azucVar.d.getPath());
                dbsg j = !matcher.matches() ? dbpy.a : dbsg.j(dbsj.f(matcher.group(1)));
                if (j.a()) {
                    azucVar.b.d(azucVar.f.getBooleanExtra("GMM_ENABLE_ONE_BACK_TAP", true));
                    if (((String) j.b()).equalsIgnoreCase("starred")) {
                        azucVar.c.G();
                    } else {
                        azucVar.c.F(axwf.d((String) j.b(), azucVar.d.toString()));
                    }
                }
            }
        });
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PLACE_LIST_SHARED_URL;
    }
}
