package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cumq  reason: default package */
/* loaded from: classes5.dex */
public final class cumq implements cvat {
    public boolean a = false;
    private final Context b;

    public cumq(Context context, ctyy ctyyVar, csui csuiVar) {
        this.b = context;
        deew.h(csuiVar.a(ctyyVar, 4), new dbrn(this) { // from class: cumo
            private final cumq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Boolean bool = (Boolean) obj;
                this.a.a = bool == null ? false : bool.booleanValue();
                return null;
            }
        }, dege.a);
    }

    private final void d(cump cumpVar, String str, boolean z) {
        cumpVar.b = dbsg.i(this.b.getString(true != z ? R.string.conversation_list_description : R.string.conversation_list_description_pending, str));
    }

    @Override // defpackage.cvat
    public final void a(cvas cvasVar, cvah cvahVar) {
        dbsg<cugu> c = cvahVar.c();
        if (!c.a()) {
            return;
        }
        cugu b = c.b();
        dbsg<cukp> b2 = cuiq.b(b);
        if (!b2.a()) {
            cstl.a("PhotosConversationCellContentAdapter");
            return;
        }
        boolean z = true;
        if (b.g().m != cugo.OUTGOING_PENDING_SEND.m && b.g().m != cugo.OUTGOING_SENDING.m) {
            z = false;
        }
        cump cumpVar = (cump) cvasVar;
        if (!b.b().equals(b.c().a())) {
            for (cufj cufjVar : cvahVar.d()) {
                if (b.b().equals(cufjVar.a()) && cufjVar.b().a()) {
                    d(cumpVar, cufjVar.b().b(), z);
                }
            }
        } else {
            d(cumpVar, this.b.getString(R.string.self_sender), z);
        }
        try {
            if (!b2.b().c().a()) {
                return;
            }
            cumpVar.a.setImageBitmap(BitmapFactory.decodeByteArray(b2.b().c().b(), 0, b2.b().c().b().length));
        } catch (ClassCastException unused) {
            cstl.a("PhotosConversationCellContentAdapter");
        }
    }

    @Override // defpackage.cvat
    public final boolean b(cvah cvahVar) {
        dbsg<cugu> c = cvahVar.c();
        return this.a && c.a() && c.b().f().a() == 3 && c.b().f().b().a().equals("photos");
    }

    @Override // defpackage.cvat
    public final cvas c() {
        return new cump(this.b);
    }
}
