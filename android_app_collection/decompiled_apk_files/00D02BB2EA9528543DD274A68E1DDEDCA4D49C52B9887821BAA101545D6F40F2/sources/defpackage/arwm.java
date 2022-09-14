package defpackage;

import android.graphics.Bitmap;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.Identifier;
import com.spotify.protocol.types.ImageUri;
import com.spotify.protocol.types.ListItem;
/* compiled from: PG */
/* renamed from: arwm  reason: default package */
/* loaded from: classes2.dex */
public class arwm implements arye {
    @dzsi
    public cqtd a;
    final /* synthetic */ arwp b;
    private final ListItem c;
    private final dxgk<Bitmap> d;

    public arwm(arwp arwpVar, ListItem listItem) {
        dxfs dxfsVar;
        this.b = arwpVar;
        arwl arwlVar = new arwl(this);
        this.d = arwlVar;
        this.c = listItem;
        ImageUri imageUri = listItem.imageUri;
        if (imageUri == null || (dxfsVar = arwpVar.m) == null) {
            return;
        }
        dxfsVar.a(imageUri).c(arwlVar);
    }

    @Override // defpackage.aryl
    @dzsi
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.aryl
    @dzsi
    public jic b() {
        return null;
    }

    @Override // defpackage.aryl
    public Boolean c() {
        return Boolean.valueOf(this.c.uri.contains("artist"));
    }

    @Override // defpackage.arye
    public CharSequence d() {
        return this.c.title;
    }

    @Override // defpackage.arye
    public cqkl e() {
        super/*arxa*/.am(arwz.SELECT_NEW_BROWSE_ITEM);
        dxfp dxfpVar = this.b.l;
        if (dxfpVar != null) {
            ListItem listItem = this.c;
            dxgm.a(listItem);
            if (!listItem.playable) {
                throw new IllegalArgumentException("The ContentItem is not playable.");
            }
            dxfpVar.a.b("com.spotify.play_item", new Identifier(listItem.id), Empty.class);
        }
        this.b.Y();
        return cqkl.a;
    }
}
