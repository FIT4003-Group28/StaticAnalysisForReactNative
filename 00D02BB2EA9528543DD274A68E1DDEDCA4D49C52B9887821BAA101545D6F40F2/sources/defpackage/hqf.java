package defpackage;

import android.view.View;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: hqf  reason: default package */
/* loaded from: classes.dex */
public final class hqf implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            switch (((iug) cqkuVar).ordinal()) {
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    if (!(view instanceof hqe) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((hqe) view).d = ((Boolean) obj).booleanValue();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    if (!(view instanceof hqe) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    hqe hqeVar = (hqe) view;
                    hqeVar.a = ((Boolean) obj).booleanValue();
                    hqeVar.f();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    if (!(view instanceof hqe) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((hqe) view).c = ((Boolean) obj).booleanValue();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    if (!(view instanceof hqe) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((hqe) view).b = ((Boolean) obj).booleanValue();
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
