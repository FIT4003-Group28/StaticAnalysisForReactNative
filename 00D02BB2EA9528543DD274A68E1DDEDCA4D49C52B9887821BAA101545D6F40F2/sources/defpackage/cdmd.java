package defpackage;

import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* renamed from: cdmd  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdmd implements dbrn {
    static final dbrn a = new cdmd();

    private cdmd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        MediaData mediaData = (MediaData) obj;
        dghj bZ = dghk.g.bZ();
        dggc dggcVar = dggc.PHOTO;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dghk dghkVar = (dghk) bZ.b;
        dghkVar.b = dggcVar.f;
        dghkVar.a |= 2;
        if (mediaData.d().a() && mediaData.e().a()) {
            dhkc bZ2 = dhkd.d.bZ();
            int intValue = mediaData.d().b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhkd dhkdVar = (dhkd) bZ2.b;
            dhkdVar.a |= 1;
            dhkdVar.b = intValue;
            int intValue2 = mediaData.e().b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhkd dhkdVar2 = (dhkd) bZ2.b;
            dhkdVar2.a |= 2;
            dhkdVar2.c = intValue2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dghk dghkVar2 = (dghk) bZ.b;
            dhkd bK = bZ2.bK();
            bK.getClass();
            dghkVar2.c = bK;
            dghkVar2.a |= 4;
        }
        final dizg bZ3 = dizh.j.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dizh dizhVar = (dizh) bZ3.b;
        dghk bK2 = bZ.bK();
        bK2.getClass();
        dizhVar.c = bK2;
        dizhVar.a |= 2;
        bvor.a(mediaData.b(), new mw(bZ3) { // from class: cdxy
            private final dizg a;

            {
                this.a = bZ3;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                dizg dizgVar = this.a;
                String str = (String) obj2;
                dggf bZ4 = dggg.d.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dggg dgggVar = (dggg) bZ4.b;
                str.getClass();
                dgggVar.a |= 2;
                dgggVar.c = str;
                dgge dggeVar = dgge.MEDIA_GUESSABLE_FIFE;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dggg dgggVar2 = (dggg) bZ4.b;
                dgggVar2.b = dggeVar.l;
                dgggVar2.a |= 1;
                if (dizgVar.c) {
                    dizgVar.bF();
                    dizgVar.c = false;
                }
                dizh dizhVar2 = (dizh) dizgVar.b;
                dggg bK3 = bZ4.bK();
                dizh dizhVar3 = dizh.j;
                bK3.getClass();
                dizhVar2.b = bK3;
                dizhVar2.a |= 1;
            }
        });
        final dwfi bZ4 = dwfl.w.bZ();
        String uri = mediaData.a().toString();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwfl dwflVar = (dwfl) bZ4.b;
        uri.getClass();
        dwflVar.a |= 128;
        dwflVar.h = uri;
        dizh bK3 = bZ3.bK();
        bK3.getClass();
        dwflVar.p = bK3;
        dwflVar.a |= 32768;
        dbsg<String> c = mediaData.c();
        bZ4.getClass();
        bvor.a(c, new mw(bZ4) { // from class: cdxz
            private final dwfi a;

            {
                this.a = bZ4;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                dwfi dwfiVar = this.a;
                String str = (String) obj2;
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar2 = (dwfl) dwfiVar.b;
                dwfl dwflVar3 = dwfl.w;
                str.getClass();
                dwflVar2.a |= 32;
                dwflVar2.g = str;
            }
        });
        return bZ4.bK();
    }
}
