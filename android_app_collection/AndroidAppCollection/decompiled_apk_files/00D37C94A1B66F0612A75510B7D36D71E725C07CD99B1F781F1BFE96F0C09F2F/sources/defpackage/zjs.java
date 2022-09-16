package defpackage;

import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zjs  reason: default package */
/* loaded from: classes4.dex */
public final class zjs extends eu {
    private final List b;
    private final List c;
    private final List d;

    public zjs(eo eoVar, FeaturedTrackSelection featuredTrackSelection, CategorySelection categorySelection, OnDeviceTrackSelection onDeviceTrackSelection) {
        super(eoVar);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.d = arrayList3;
        if (featuredTrackSelection != null) {
            zkn zknVar = new zkn();
            zknVar.b = featuredTrackSelection;
            arrayList.add(zknVar);
            arrayList2.add(featuredTrackSelection.b);
            arrayList3.add(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_LIBRARY_SUGGESTED_TAB);
        }
        if (categorySelection != null) {
            zkd zkdVar = new zkd();
            zkdVar.b = categorySelection;
            arrayList.add(zkdVar);
            arrayList2.add(categorySelection.a);
            arrayList3.add(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_LIBRARY_CATEGORY_TAB);
        }
        if (onDeviceTrackSelection != null) {
            zkn zknVar2 = new zkn();
            zknVar2.b = onDeviceTrackSelection;
            arrayList.add(zknVar2);
            arrayList2.add(onDeviceTrackSelection.b);
            arrayList3.add(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_LIBRARY_ON_DEVICE_TAB);
        }
    }

    @Override // defpackage.eu
    public final dp b(int i) {
        List list = this.b;
        zdk.a(i, list.size());
        return (dp) list.get(i);
    }

    @Override // defpackage.bpg
    public final int j() {
        return this.b.size();
    }

    @Override // defpackage.bpg
    public final CharSequence l(int i) {
        List list = this.c;
        zdk.a(i, list.size());
        return (CharSequence) list.get(i);
    }

    public final actj o(int i) {
        List list = this.d;
        zdk.a(i, list.size());
        return (actj) list.get(i);
    }
}
