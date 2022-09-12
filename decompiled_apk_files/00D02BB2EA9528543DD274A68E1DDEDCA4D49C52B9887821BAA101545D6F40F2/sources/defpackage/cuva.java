package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cuva  reason: default package */
/* loaded from: classes5.dex */
public final class cuva {
    private static WeakReference<cuva> a = new WeakReference<>(null);
    private final LruCache<cuux, cuuz> b = new LruCache<>(50);

    public static synchronized cuva a() {
        synchronized (cuva.class) {
            cuva cuvaVar = a.get();
            if (cuvaVar == null) {
                cuva cuvaVar2 = new cuva();
                a = new WeakReference<>(cuvaVar2);
                return cuvaVar2;
            }
            return cuvaVar;
        }
    }

    public final synchronized Bitmap b(cufj cufjVar, int i, cuve cuveVar) {
        Bitmap bitmap;
        cuur cuurVar = new cuur();
        ContactId a2 = cufjVar.a();
        if (a2 != null) {
            cuurVar.a = a2;
            cuurVar.b = Integer.valueOf(i);
            String str = cuurVar.a == null ? " contactId" : "";
            if (cuurVar.b == null) {
                str = str.concat(" sizeInPx");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            cuus cuusVar = new cuus(cuurVar.a, cuurVar.b.intValue());
            cuuz cuuzVar = this.b.get(cuusVar);
            if (cuuzVar != null && cuuzVar.b().equals(cufjVar.d()) && cuuzVar.c() == cufjVar.hashCode()) {
                bitmap = cuuzVar.a();
            }
            cuut cuutVar = new cuut();
            dbsg<String> d = cufjVar.d();
            if (d != null) {
                cuutVar.b = d;
                cuutVar.c = Integer.valueOf(cufjVar.hashCode());
                int i2 = cuusVar.a;
                ContactAvatarView contactAvatarView = cuveVar.a;
                Bitmap d2 = contactAvatarView.a.d(cufjVar, i2, contactAvatarView.d, contactAvatarView.e, dbpy.a, contactAvatarView.getContext().getDrawable(2131232062));
                if (d2 != null) {
                    cuutVar.a = d2;
                    String str2 = cuutVar.a == null ? " avatar" : "";
                    if (cuutVar.c == null) {
                        str2 = str2.concat(" profileHashCode");
                    }
                    if (!str2.isEmpty()) {
                        String valueOf2 = String.valueOf(str2);
                        throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
                    }
                    cuuu cuuuVar = new cuuu(cuutVar.a, cuutVar.b, cuutVar.c.intValue());
                    this.b.put(cuusVar, cuuuVar);
                    bitmap = cuuuVar.a;
                } else {
                    throw new NullPointerException("Null avatar");
                }
            } else {
                throw new NullPointerException("Null imageUrl");
            }
        } else {
            throw new NullPointerException("Null contactId");
        }
        return bitmap;
    }
}
