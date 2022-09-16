package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahjb  reason: default package */
/* loaded from: classes2.dex */
public class ahjb extends ahhv {
    private final List<agxa<?>> a;
    private final List<agwu> b;
    private final cqix<agyq> c;
    private final cjta d;

    public ahjb(ahht ahhtVar, ahas ahasVar, dlcv dlcvVar, agyh agyhVar, List<agxa<?>> list, List<agwu> list2, cjta cjtaVar, String str) {
        super(ahhtVar, dlcvVar, agyhVar);
        String str2;
        this.a = list;
        this.b = list2;
        this.d = cjtaVar;
        dlam dlamVar = dlcvVar.g;
        if ((dlamVar == null ? dlam.d : dlamVar).c.size() == 1) {
            dlam dlamVar2 = dlcvVar.g;
            str2 = (dlamVar2 == null ? dlam.d : dlamVar2).c.get(0).a;
        } else {
            str2 = null;
        }
        this.c = cqgr.fT(new agdv(), ahasVar.a(str, str2, new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.localstream_photo_icon_svg), 0), null, cjtd.b, str, null, this));
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.a;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.d.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return this.c;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.b;
    }
}
