package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhkz  reason: default package */
/* loaded from: classes3.dex */
public abstract class bhkz extends acts {
    protected btvo b;
    protected dxio<bbut> c;
    protected final Resources e;

    public bhkz(Resources resources, cjqy cjqyVar, btvo btvoVar, dxio<bbut> dxioVar) {
        super(cjqyVar);
        this.e = resources;
        this.b = btvoVar;
        this.c = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<actk> B(@dzsi final bwrs<ilo> bwrsVar, ddho ddhoVar) {
        ArrayList arrayList = new ArrayList();
        if (bwrs.b(bwrsVar) != null) {
            dcdc<dwfl> a = bhku.a((ilo) bwrs.b(bwrsVar));
            dcdc<dwfl> subList = a.subList(0, Math.min(20, a.size()));
            final int i = 0;
            while (i < subList.size()) {
                dwfl dwflVar = subList.get(i);
                int i2 = i + 1;
                arrayList.add(new bhkx(dwflVar.h, new View.OnClickListener(this, bwrsVar, i) { // from class: bhky
                    private final bhkz a;
                    private final bwrs b;
                    private final int c;

                    {
                        this.a = this;
                        this.b = bwrsVar;
                        this.c = i;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bhkz bhkzVar = this.a;
                        bwrs<ilo> bwrsVar2 = this.b;
                        int i3 = this.c;
                        ckne ckneVar = new ckne(bhku.a((ilo) bwrs.b(bwrsVar2)));
                        bbtv v = bbty.v();
                        v.k(true);
                        v.o(true);
                        v.t(true);
                        v.p(afyb.i(bhkzVar.b, afyc.PLACESHEET_MENU_CAROUSEL));
                        bhkzVar.c.a().p(ckneVar, i3, v.a(), bwrsVar2, null);
                    }
                }, dwflVar, i, this.e.getQuantityString(R.plurals.MENU_PHOTO_CAROUSEL_PHOTO_THUMBNAIL_CONTENT_DESCRIPTION, i2, Integer.valueOf(i2)), ddhoVar));
                i = i2;
            }
        }
        return arrayList;
    }
}
