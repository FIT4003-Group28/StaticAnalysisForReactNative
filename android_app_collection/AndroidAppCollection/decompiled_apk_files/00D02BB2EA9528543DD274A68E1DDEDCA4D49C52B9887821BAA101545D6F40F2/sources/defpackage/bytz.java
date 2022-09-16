package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bytz  reason: default package */
/* loaded from: classes4.dex */
public final class bytz {
    public final bytc a;
    public final byub b;

    public bytz(bytc bytcVar, byub byubVar) {
        this.a = bytcVar;
        this.b = byubVar;
    }

    public final void a(akqq akqqVar) {
        byua a = this.b.a(akqqVar);
        if (a.equals(byua.NEW_YORK)) {
            this.a.a(102);
        } else if (a.equals(byua.LONDON)) {
            this.a.a(R.styleable.AppCompatTheme_textAppearanceListItem);
        } else if (a.equals(byua.NEW_DELHI)) {
            this.a.a(104);
        } else if (a.equals(byua.TOKYO)) {
            this.a.a(105);
        } else if (a.equals(byua.SYDNEY)) {
            this.a.a(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
        } else if (a.equals(byua.JAKARTA)) {
            this.a.a(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
        } else if (!a.equals(byua.RIO_DE_JANEIRO)) {
        } else {
            this.a.a(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
    }

    public final void b(akqq akqqVar) {
        byua a = this.b.a(akqqVar);
        if (a.equals(byua.NEW_YORK)) {
            this.a.a(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        } else if (a.equals(byua.LONDON)) {
            this.a.a(R.styleable.AppCompatTheme_textColorAlertDialogListItem);
        } else if (a.equals(byua.NEW_DELHI)) {
            this.a.a(R.styleable.AppCompatTheme_textColorSearchUrl);
        } else if (a.equals(byua.TOKYO)) {
            this.a.a(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        } else if (a.equals(byua.SYDNEY)) {
            this.a.a(R.styleable.AppCompatTheme_toolbarStyle);
        } else if (a.equals(byua.JAKARTA)) {
            this.a.a(R.styleable.AppCompatTheme_tooltipForegroundColor);
        } else if (!a.equals(byua.RIO_DE_JANEIRO)) {
        } else {
            this.a.a(R.styleable.AppCompatTheme_tooltipFrameBackground);
        }
    }
}
