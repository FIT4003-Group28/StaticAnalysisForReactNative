package com.facebook.react.views.toolbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.facebook.react.b.f;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.o;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactToolbarManager extends ViewGroupManager<b> {
    private static final String REACT_CLASS = "ToolbarAndroid";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public b mo170createViewInstance(af afVar) {
        return new b(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "logo")
    public void setLogo(b bVar, an anVar) {
        bVar.setLogoSource(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "navIcon")
    public void setNavIcon(b bVar, an anVar) {
        bVar.setNavIconSource(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "overflowIcon")
    public void setOverflowIcon(b bVar, an anVar) {
        bVar.setOverflowIconSource(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "rtl")
    public void setRtl(b bVar, boolean z) {
        bVar.setLayoutDirection(z ? 1 : 0);
    }

    @com.facebook.react.uimanager.a.a(a = "subtitle")
    public void setSubtitle(b bVar, String str) {
        bVar.setSubtitle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "subtitleColor", b = "Color")
    public void setSubtitleColor(b bVar, Integer num) {
        int[] defaultColors = getDefaultColors(bVar.getContext());
        if (num != null) {
            bVar.setSubtitleTextColor(num.intValue());
        } else {
            bVar.setSubtitleTextColor(defaultColors[1]);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "title")
    public void setTitle(b bVar, String str) {
        bVar.setTitle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "titleColor", b = "Color")
    public void setTitleColor(b bVar, Integer num) {
        int[] defaultColors = getDefaultColors(bVar.getContext());
        if (num != null) {
            bVar.setTitleTextColor(num.intValue());
        } else {
            bVar.setTitleTextColor(defaultColors[0]);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "contentInsetStart", d = Float.NaN)
    public void setContentInsetStart(b bVar, float f) {
        int round;
        if (Float.isNaN(f)) {
            round = getDefaultContentInsets(bVar.getContext())[0];
        } else {
            round = Math.round(o.a(f));
        }
        bVar.a(round, bVar.getContentInsetEnd());
    }

    @com.facebook.react.uimanager.a.a(a = "contentInsetEnd", d = Float.NaN)
    public void setContentInsetEnd(b bVar, float f) {
        int round;
        if (Float.isNaN(f)) {
            round = getDefaultContentInsets(bVar.getContext())[1];
        } else {
            round = Math.round(o.a(f));
        }
        bVar.a(bVar.getContentInsetStart(), round);
    }

    @com.facebook.react.uimanager.a.a(a = "nativeActions")
    public void setActions(b bVar, am amVar) {
        bVar.setActions(amVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, final b bVar) {
        final c eventDispatcher = ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher();
        bVar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.toolbar.ReactToolbarManager.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eventDispatcher.a(new com.facebook.react.views.toolbar.a.a(bVar.getId(), -1));
            }
        });
        bVar.setOnMenuItemClickListener(new Toolbar.c() { // from class: com.facebook.react.views.toolbar.ReactToolbarManager.2
            @Override // android.support.v7.widget.Toolbar.c
            public boolean a(MenuItem menuItem) {
                eventDispatcher.a(new com.facebook.react.views.toolbar.a.a(bVar.getId(), menuItem.getOrder()));
                return true;
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return f.a("ShowAsAction", f.a("never", 0, "always", 2, "ifRoom", 1));
    }

    private int[] getDefaultContentInsets(Context context) {
        TypedArray typedArray;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray2 = null;
        try {
            typedArray = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedArray.getResourceId(0, 0), new int[]{getIdentifier(context, "contentInsetStart"), getIdentifier(context, "contentInsetEnd")});
                try {
                    int[] iArr = {obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0)};
                    recycleQuietly(typedArray);
                    recycleQuietly(obtainStyledAttributes);
                    return iArr;
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = obtainStyledAttributes;
                    recycleQuietly(typedArray);
                    recycleQuietly(typedArray2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    private static int[] getDefaultColors(Context context) {
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray4 = null;
        try {
            typedArray2 = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedArray2.getResourceId(0, 0), new int[]{getIdentifier(context, "titleTextAppearance"), getIdentifier(context, "subtitleTextAppearance")});
                try {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                    typedArray3 = theme.obtainStyledAttributes(resourceId, new int[]{16842904});
                    try {
                        typedArray = theme.obtainStyledAttributes(resourceId2, new int[]{16842904});
                        try {
                            int[] iArr = {typedArray3.getColor(0, -16777216), typedArray.getColor(0, -16777216)};
                            recycleQuietly(typedArray2);
                            recycleQuietly(obtainStyledAttributes);
                            recycleQuietly(typedArray3);
                            recycleQuietly(typedArray);
                            return iArr;
                        } catch (Throwable th) {
                            typedArray4 = obtainStyledAttributes;
                            th = th;
                            recycleQuietly(typedArray2);
                            recycleQuietly(typedArray4);
                            recycleQuietly(typedArray3);
                            recycleQuietly(typedArray);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        typedArray4 = obtainStyledAttributes;
                        th = th2;
                        typedArray = null;
                    }
                } catch (Throwable th3) {
                    typedArray3 = null;
                    typedArray4 = obtainStyledAttributes;
                    th = th3;
                    typedArray = null;
                }
            } catch (Throwable th4) {
                th = th4;
                typedArray = null;
                typedArray3 = null;
            }
        } catch (Throwable th5) {
            th = th5;
            typedArray = null;
            typedArray2 = null;
            typedArray3 = null;
        }
    }

    private static void recycleQuietly(TypedArray typedArray) {
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }
}
