package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: btwb  reason: default package */
/* loaded from: classes.dex */
final class btwb implements dbty<List<dvdf>> {
    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ List<dvdf> a() {
        ArrayList a = dchl.a();
        dcdc g = dcdc.g(dvdm.CAMERA_2D_NORTH_UP, dvdm.CAMERA_2D_HEADING_UP);
        int size = g.size();
        for (int i = 0; i < size; i++) {
            dvdm dvdmVar = (dvdm) g.get(i);
            btwd.a(a, dvdmVar, false, false, 15.0f, 15.5f, 16.25f, 16.25f, 16.25f);
            btwd.a(a, dvdmVar, true, false, 16.0f, 16.5f, 17.25f, 16.25f, 17.25f);
            btwd.a(a, dvdmVar, false, true, 15.25f, 16.5f, 16.5f, 18.25f, 16.5f);
            btwd.a(a, dvdmVar, true, true, 16.0f, 16.75f, 18.0f, 18.25f, 18.0f);
        }
        btwd.a(a, dvdm.CAMERA_3D, false, false, 15.5f, 16.75f, 17.75f, 17.75f, 17.75f);
        btwd.a(a, dvdm.CAMERA_3D, true, false, 15.5f, 17.0f, 18.25f, 17.75f, 18.25f);
        btwd.a(a, dvdm.CAMERA_3D, false, true, 15.5f, 18.25f, 18.25f, 18.25f, 18.25f);
        btwd.a(a, dvdm.CAMERA_3D, true, true, 15.5f, 18.5f, 18.5f, 18.25f, 18.5f);
        return a;
    }
}
