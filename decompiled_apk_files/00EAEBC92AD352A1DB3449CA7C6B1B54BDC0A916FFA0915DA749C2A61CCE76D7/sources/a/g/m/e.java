package a.g.m;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f338a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Method f339b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f340c = false;

    /* renamed from: d  reason: collision with root package name */
    private static Field f341d;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    private static DialogInterface.OnKeyListener a(Dialog dialog) {
        if (!f340c) {
            try {
                f341d = Dialog.class.getDeclaredField("mOnKeyListener");
                f341d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f340c = true;
        }
        Field field = f341d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean a(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.a(keyEvent) : callback instanceof Activity ? a((Activity) callback, keyEvent) : callback instanceof Dialog ? a((Dialog) callback, keyEvent) : (view != null && v.a(view, keyEvent)) || aVar.a(keyEvent);
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f338a) {
            try {
                f339b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f338a = true;
        }
        Method method = f339b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (v.a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener a2 = a(dialog);
        if (a2 == null || !a2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (v.a(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return v.b(view, keyEvent);
    }
}
