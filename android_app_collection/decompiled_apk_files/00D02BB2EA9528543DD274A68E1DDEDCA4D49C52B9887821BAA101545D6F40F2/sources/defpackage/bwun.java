package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.google.geo.imagery.viewer.api.IconRequest;
import com.google.geo.imagery.viewer.api.IconRequestContainer;
import com.google.geo.imagery.viewer.api.IconService;
import com.google.geo.imagery.viewer.api.IconServiceSwigJNI;
import com.google.geo.imagery.viewer.api.IconSource;
/* compiled from: PG */
/* renamed from: bwun  reason: default package */
/* loaded from: classes4.dex */
public final class bwun extends IconService {
    public final dfuh a;
    private final bwus c;
    private final Resources d;

    public bwun(dfuh dfuhVar, ckqm ckqmVar, bwzi bwziVar, Resources resources, bvrb bvrbVar) {
        this.d = resources;
        this.a = dfuhVar;
        this.c = new bwus(ckqmVar, bwziVar, bvrbVar);
    }

    @Override // com.google.geo.imagery.viewer.api.IconService
    public final void cancel(IconSource iconSource) {
    }

    @Override // com.google.geo.imagery.viewer.api.IconService
    public final void request(IconRequest iconRequest) {
        IconRequestContainer iconRequestContainer = new IconRequestContainer(IconServiceSwigJNI.new_RequestContainer(IconRequest.a(iconRequest), iconRequest));
        if ((iconRequestContainer.c().a & 2) != 0) {
            iconRequestContainer.b(BitmapFactory.decodeResource(this.d, (int) iconRequestContainer.c().c));
        }
        if ((iconRequestContainer.c().a & 1) != 0) {
            this.c.a(new bwum(this, iconRequestContainer), iconRequestContainer.c().b);
        }
    }
}
