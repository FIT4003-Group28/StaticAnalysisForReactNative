package defpackage;

import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zpp  reason: default package */
/* loaded from: classes4.dex */
public final class zpp {
    public boolean b;
    private final zrj c;
    private final zrj d;
    private final Map e;
    private final HashSet f = new HashSet();
    final HashMap a = new HashMap();

    public zpp(zrp zrpVar, Map map) {
        map.getClass();
        this.e = amup.j(map);
        this.c = zrpVar.f(new zrn() { // from class: zpm
            @Override // defpackage.zdt
            public final void a(Object obj) {
                zpp.this.a((zsq) obj);
            }
        });
        this.d = zrpVar.d(new zri() { // from class: zpl
            @Override // defpackage.zdt
            public final void a(Object obj) {
                zpp.this.b((String) obj);
            }
        });
    }

    private final void d(final File file, final View view) {
        if (view != null) {
            view.post(new Runnable() { // from class: zpo
                @Override // java.lang.Runnable
                public final void run() {
                    zpp zppVar = zpp.this;
                    File file2 = file;
                    View view2 = view;
                    Drawable createFromPath = Drawable.createFromPath(file2.getPath());
                    if (createFromPath != null) {
                        view2.setBackground(createFromPath);
                        String valueOf = String.valueOf(file2.getPath());
                        String concat = valueOf.length() != 0 ? "StaticThumbnailProvider::drawStaticThumbnail: ".concat(valueOf) : new String("StaticThumbnailProvider::drawStaticThumbnail: ");
                        if (!zppVar.b) {
                            return;
                        }
                        zep.c("PresetFilterDebug", concat);
                    }
                }
            });
        }
    }

    public final synchronized void a(zsq zsqVar) {
        File file = (File) this.e.get(zsqVar.a);
        if (file == null) {
            return;
        }
        final TextureView textureView = zsqVar.b.a;
        textureView.post(new Runnable() { // from class: zpn
            @Override // java.lang.Runnable
            public final void run() {
                textureView.setVisibility(4);
            }
        });
        View view = zsqVar.b.b;
        if (this.f.contains(file)) {
            d(file, view);
            return;
        }
        if (this.a.get(file) == null) {
            this.a.put(file, new ArrayList());
        }
        ((List) this.a.get(file)).add(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        File file = new File(str);
        if (this.a.containsKey(file)) {
            for (View view : (List) this.a.get(file)) {
                d(file, view);
            }
            this.a.remove(file);
        }
        this.f.add(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        this.c.a();
        this.d.a();
    }
}
