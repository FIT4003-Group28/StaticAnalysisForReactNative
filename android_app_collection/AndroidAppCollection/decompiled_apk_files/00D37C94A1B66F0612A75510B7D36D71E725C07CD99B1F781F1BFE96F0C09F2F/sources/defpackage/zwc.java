package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zwc  reason: default package */
/* loaded from: classes4.dex */
public final class zwc {
    public static final Map a;
    public static final Map b;
    public final Context c;

    static {
        EnumMap enumMap = new EnumMap(zvs.class);
        enumMap.put((EnumMap) zvs.GALLERY, (zvs) zwb.a);
        enumMap.put((EnumMap) zvs.IMAGE, (zvs) zwb.c);
        enumMap.put((EnumMap) zvs.VIDEO, (zvs) zwb.d);
        a = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap2 = new EnumMap(zvs.class);
        enumMap2.put((EnumMap) zvs.GALLERY, (zvs) Integer.valueOf((int) R.string.all_media_album_display_name));
        enumMap2.put((EnumMap) zvs.IMAGE, (zvs) Integer.valueOf((int) R.string.photos_album_display_name));
        enumMap2.put((EnumMap) zvs.VIDEO, (zvs) Integer.valueOf((int) R.string.videos_album_display_name));
        b = Collections.unmodifiableMap(enumMap2);
    }

    public zwc(Context context) {
        this.c = context;
    }

    public static amuk a(List list, final zvu zvuVar) {
        List list2;
        if (zvuVar.a == zvs.FOLDER) {
            list2 = (List) ayoi.Q(list).I(new ayqf() { // from class: zwa
                @Override // defpackage.ayqf
                public final boolean a(Object obj) {
                    zvu zvuVar2 = zvu.this;
                    Map map = zwc.a;
                    return ((DeviceLocalFile) obj).g().equals(zvuVar2.e.c());
                }
            }).aq().U();
        } else {
            list2 = (List) ayoi.Q(list).I((ayqf) a.get(zvuVar.a)).aq().U();
        }
        return amuk.o(list2);
    }
}
