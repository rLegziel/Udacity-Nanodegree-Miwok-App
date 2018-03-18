package com.example.android.miwok;

/**
 * Created by roix on 3/11/18.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //** get english translation */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //** get miwok translation */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
