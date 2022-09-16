package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cuul  reason: default package */
/* loaded from: classes5.dex */
public final class cuul {
    private static WeakReference<cuul> a = new WeakReference<>(null);
    private final LruCache<cuui, cuuk> b = new LruCache<>(50);

    public static synchronized cuul a() {
        synchronized (cuul.class) {
            cuul cuulVar = a.get();
            if (cuulVar == null) {
                cuul cuulVar2 = new cuul();
                a = new WeakReference<>(cuulVar2);
                return cuulVar2;
            }
            return cuulVar;
        }
    }

    public final synchronized cuuk b(ConversationId conversationId, int i, boolean z) {
        cuuh d;
        d = cuui.d();
        d.b(conversationId);
        d.d(i);
        d.c(z);
        return this.b.get(d.a());
    }

    public final synchronized Bitmap c(cufp cufpVar, dbsg<cufj> dbsgVar, int i, cuum cuumVar, boolean z) {
        Bitmap bitmap;
        cuuh d = cuui.d();
        d.b(cufpVar.a());
        d.d(i);
        d.c(z);
        cuui a2 = d.a();
        cuuk cuukVar = this.b.get(a2);
        if (cuukVar != null && cuukVar.b().equals(cufpVar.c()) && cuukVar.c() == cufpVar.hashCode()) {
            if (!cuukVar.b().a() && cufpVar.a().c().equals(ConversationId.IdType.ONE_TO_ONE)) {
                if (!dbsgVar.a()) {
                    if (!cuukVar.d()) {
                    }
                } else if (!cuukVar.d()) {
                    if (cuukVar.e().equals(dbsgVar.b().d())) {
                        if (cuukVar.f().a()) {
                            if (cuukVar.f().b().intValue() != dbsgVar.b().hashCode()) {
                            }
                        }
                    }
                }
            }
            bitmap = cuukVar.a();
        }
        cuup cuupVar = new cuup();
        cuupVar.c = Integer.valueOf(cufpVar.hashCode());
        dbsg<String> c = cufpVar.c();
        if (c != null) {
            cuupVar.b = c;
            Bitmap a3 = cuumVar.a(cufpVar, dbsgVar, a2.b(), z);
            if (a3 != null) {
                cuupVar.a = a3;
                if (dbsgVar.a()) {
                    cuupVar.f = dbsg.i(Integer.valueOf(dbsgVar.b().hashCode()));
                    dbsg<String> d2 = dbsgVar.b().d();
                    if (d2 != null) {
                        cuupVar.e = d2;
                        cuupVar.a(false);
                    } else {
                        throw new NullPointerException("Null contactImageUrl");
                    }
                } else {
                    cuupVar.a(true);
                }
                String str = cuupVar.a == null ? " avatar" : "";
                if (cuupVar.c == null) {
                    str = str.concat(" conversationProfileHashCode");
                }
                if (cuupVar.d == null) {
                    str = String.valueOf(str).concat(" isDefault");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                cuuq cuuqVar = new cuuq(cuupVar.a, cuupVar.b, cuupVar.c.intValue(), cuupVar.d.booleanValue(), cuupVar.e, cuupVar.f);
                this.b.put(a2, cuuqVar);
                bitmap = cuuqVar.a;
            } else {
                throw new NullPointerException("Null avatar");
            }
        } else {
            throw new NullPointerException("Null conversationImageUrl");
        }
        return bitmap;
    }
}
