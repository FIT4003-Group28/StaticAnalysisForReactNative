package defpackage;

import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ijy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ijy implements aynt {
    public final /* synthetic */ ike a;
    public final /* synthetic */ asvl b;
    private final /* synthetic */ int c;

    public /* synthetic */ ijy(ike ikeVar, asvl asvlVar) {
        this.a = ikeVar;
        this.b = asvlVar;
    }

    public /* synthetic */ ijy(ike ikeVar, asvl asvlVar, int i) {
        this.c = i;
        this.a = ikeVar;
        this.b = asvlVar;
    }

    @Override // defpackage.aynt
    public final void a(final aysm aysmVar) {
        if (this.c == 0) {
            final ike ikeVar = this.a;
            final asvl asvlVar = this.b;
            ikeVar.M = new akdv(akdu.d(ikeVar), ikeVar.oi(), Arrays.asList(new PermissionDescriptor(3, actj.EDIT_VIDEO_APPROVE_LOCATION_BUTTON, actj.EDIT_VIDEO_DENY_LOCATION_BUTTON)), R.string.permission_open_settings_location, R.string.permissions_missing_location, new Runnable() { // from class: ijv
                @Override // java.lang.Runnable
                public final void run() {
                    ike ikeVar2 = ike.this;
                    asvl asvlVar2 = asvlVar;
                    final aysm aysmVar2 = aysmVar;
                    ikeVar2.w(asvlVar2).R(new aypv() { // from class: ijz
                        @Override // defpackage.aypv
                        public final void a() {
                            aysm.this.a();
                        }
                    });
                }
            }, new Runnable() { // from class: ijw
                @Override // java.lang.Runnable
                public final void run() {
                    aysm.this.a();
                }
            }, ikeVar.I);
            ikeVar.M.a();
            return;
        }
        ike ikeVar2 = this.a;
        asvl asvlVar2 = this.b;
        ikc ikcVar = ikeVar2.Q;
        aysm aysmVar2 = ikcVar.c;
        if (aysmVar2 != null && !aysmVar2.e()) {
            ikcVar.c.a();
        }
        ikcVar.c = aysmVar;
        ikcVar.a = asvlVar2;
        afqv afqvVar = ikeVar2.L;
        if (afqvVar == null) {
            afqvVar = ikeVar2.H.a((LocationSearchView) ikeVar2.findViewById(R.id.location_search_view), ikeVar2.Q);
        }
        ikeVar2.m().setVisibility(8);
        ikeVar2.n().b(R.id.location_search_view);
        afqvVar.a();
        ikeVar2.L = afqvVar;
    }
}
