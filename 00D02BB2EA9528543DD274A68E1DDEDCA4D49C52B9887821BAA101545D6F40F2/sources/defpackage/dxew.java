package defpackage;

import com.google.gson.internal.Excluder;
import com.spotify.protocol.mappers.gson.GsonMapper$ByteArrayToBase64TypeAdapter;
import com.spotify.protocol.mappers.gson.GsonMapper$ImageUriGson;
import com.spotify.protocol.types.ImageUri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxew  reason: default package */
/* loaded from: classes6.dex */
public final class dxew {
    public final String b;
    public final dxhr d;
    public final String a = "8b7569cef4fc4ee09d07142d8a4b2f6b";
    public final List<String> c = dxha.a;

    public dxew(String str) {
        this.b = str;
        Excluder excluder = Excluder.a;
        dgsq dgsqVar = dgsq.IDENTITY;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dgsy.a(ImageUri.class, new GsonMapper$ImageUriGson(), hashMap, arrayList);
        dgsy.a(byte[].class, new GsonMapper$ByteArrayToBase64TypeAdapter(), hashMap, arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList.size() + arrayList2.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        this.d = new dxhr(new dgsx(excluder, dgsqVar, hashMap, 1, arrayList3));
    }
}
